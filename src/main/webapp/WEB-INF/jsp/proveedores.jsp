<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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

  #btn-submit {
    border-color: hsl(281, 72%, 46%);
    background-color: hsl(281, 72%, 86%);
    color: hsl(281, 72%, 46%);
  }
  #btn-remove {
      border-color: #8a0f0f;
      background-color: hsl(0, 80%, 80%);
      color: #8a0f0f;
  }

  .input-text {
    border: solid 1px;
    margin-top: 0.3rem;
    margin-left: 9rem;
    border-radius: 5px;
    height: 1.5rem;
    text-indent: 0.5rem;
  }

  #form-container {
    padding: 1rem 3rem 1.5rem;
  }

  #title-page{
    font-weight: bold;
    margin-left: 11rem;
    color: #BE4B4B;
    font-size: 1.2em;
  }

  #container {
    background-color: white;
    width: 48%;
    height: 100%;
    border-radius: 10px;
    font-family: var(--tb-ft-family);
    padding-top: 2rem;
    padding-bottom: 3rem;
    margin: 5rem auto 4rem;
  }
</style>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Proveedores</title>
</head>
<body>
    <main>
        <div id="container">
            <span id="title-page">Administrador de Proveedores</span>
            <form:form
                    modelAttribute="provider"
                    method="POST"
                    action="/addProvider"
                    id="form-container"
            >
                <form:input
                        path="name"
                        class="input-text"
                        placeholder="Nombre" />
                <input
                        class="btn"
                        id="btn-submit"
                        type="submit"
                        value="Agregar"
                >
            </form:form>
            <table>
                <thead>
                <tr>
                    <th class="tb-header">ID</th>
                    <th class="tb-header">Nombre</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${providers}" var="p">
                    <tr class="content-body">
                        <form:form
                                modelAttribute="provider"
                                method="POST"
                                action="/removeProvider"
                        >
                            <td class="td-item">
                                <form:input path="id" readonly="true" value="${p.id}" style="width: 20px; border: none;"/>
                            </td>
                            <td class="td-item">${p.name}</td>
                            <td>
                                <input class="btn" id="btn-remove" type="submit" value="Borrar"/>
                            </td>
                        </form:form>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </main>
</body>
</html>