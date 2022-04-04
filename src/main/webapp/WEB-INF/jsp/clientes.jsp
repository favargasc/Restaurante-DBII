<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<style>
  :root {
    --tb-ft-family: "Roboto", -apple-system, BlinkMacSystemFont, "Segoe UI",
    Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif,
    "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
    --home-bg-color: #edeef3;
  }

  * {
    margin: 0;
    padding: 0;
  }

  * :focus {
    outline: none;
  }

  body {
    background-color: var(--home-bg-color);
  }

  table {
    border-collapse: collapse;
    margin: auto;
  }

  #crud-container {
    background-color: white;
    width: 65%;
    height: 100%;
    border-radius: 10px;
    font-family: var(--tb-ft-family);
    padding-top: 2rem;
    padding-bottom: 3rem;
    margin: 5rem auto 4rem;
  }

  th,
  td {
    height: 1rem;
    padding: 0.5rem 2rem 0.5rem 2rem;
    text-align: left;
    border-bottom: solid 1px #d6d6d6;
  }

  .content-body:hover {
    background-color: hsl(0, 0%, 95%);
  }

  .btn {
    text-align: center;
    padding: 0.3rem 1rem;
    border-radius: 5px;
    margin-left: 0.3rem;
    border: 1px solid;
  }

  #btn-remove {
    border-color: #8a0f0f;
    background-color: hsl(0, 80%, 80%);
    color: #8a0f0f;
  }

  #btn-submit {
    border-color: hsl(281, 72%, 46%);
    background-color: hsl(281, 72%, 86%);
    color: hsl(281, 72%, 46%);
  }

  .input-text {
    border: solid 1px;
    margin-top: 0.3rem;
    margin-left: 1rem;
    border-radius: 5px;
    height: 1.5rem;
    text-indent: 0.5rem;
  }

  #form-container {
    padding: 1rem 3rem 1.5rem 5rem;
  }

  #title-page{
    font-weight: bold;
    margin-left: 6rem;
    color: #BE4B4B;
    font-size: 1.2em;
  }
</style>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Clientes</title>
</head>
<body>
  <main>
    <div id="crud-container">
      <span id="title-page">Administrador Cliente</span>
        
      <%--@elvariable id="client" type="Client"--%>
      <form:form id="form-container" modelAttribute="client" method="POST" action="/add_client">
        <form:input path="name" class="input-text" placeholder="Nombre" type="text"/>
        <form:input path="phone" class="input-text" placeholder="Telefono" type="text"/>
        <form:input path="address" class="input-text" placeholder="Direccion" type="text"/>
            <input class="btn" id="btn-submit" type="submit" value="Agregar"/>
      </form:form>
        
      <table>
        <thead>
          <tr>
            <th class="tb-header">ID</th>
            <th class="tb-header">Nombre</th>
            <th class="tb-header">Telefono</th>
            <th class="tb-header">Direccion</th>
            <th class="tb-header" style="text-align:center">Action</th>
          </tr>
        </thead>
        <tbody>
          <%--@elvariable id="clients" type="java.util.List"--%>
          <c:forEach items="${clients}" var="cl">
            <%--@elvariable id="client" type="com.project.restaurant.models.Client"--%>
            <form:form
                    modelAttribute="client"
                    method="POST"
                    action="/remove_client"
                    style="padding-left: 2rem;"
            >
                <tr class="content-body">
                    <td class="id-item">
                      <form:input path="id" readonly="true" value="${cl.id}" style="width: 20px; border: none;"/>
                    </td>
                    <td class="td-item">${cl.name}</td>
                    <td class="td-item">${cl.phone}</td>
                    <td class="td-item">${cl.address}</td>
                    <td class="td-item">
                        <input class="btn" id="btn-remove" type="submit" value="Borrar"/>
                    </td>
               </tr>
            </form:form>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </main>
</body>
</html>