<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
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

  #btn-edit {
    border-color: hsl(202, 80%, 30%);
    color: hsl(202, 80%, 30%);
    background-color:hsl(202, 100%, 79%);

  }

  .input-text {
    border: solid 1px;
    margin-top: 0.3rem;
    margin-left: 0.3rem;
    border-radius: 5px;
    height: 1.5rem;
    text-indent: 0.5rem;
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

  #form-container {
    padding: 1rem 3rem 1.5rem;
  }

  #title-page{
    font-weight: bold;
    margin-left: 3.3rem;
    color: #BE4B4B;
    font-size: 1.2em;
  }

  #container {
    background-color: white;
    width: 65%;
    height: 100%;
    border-radius: 10px;
    font-family: var(--tb-ft-family);
    padding-top: 2rem;
    padding-bottom: 3rem;
    margin: 5rem auto 4rem;
  }

  .input {
    width: 8rem;
    border: solid 1px;
    margin-top: 0.3rem;
    margin-left: 0.3rem;
    border-radius: 5px;
    height: 1.5rem;
    text-indent: 0.5rem;
  }

  .select {
    width: 8rem;
    border: solid 1px;
    margin-top: 0.3rem;
    margin-left: 0.3rem;
    border-radius: 5px;
    height: 1.6rem;
    text-indent: 0.5rem;
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
    <div id="container">
      <span id="title-page">Administrador de Inventario</span>
      <form:form id="form-container" modelAttribute="inInventory" method="POST" action="/add_inventory">
        <form:input class="input" placeholder="Nombre" type="text" path="name"/>

        <form:select class="select" path="providerId">
          <c:forEach items="${inventoryDAO.providers}" var="ip">
            <option value="${ip.id}">${ip.name}</option>
          </c:forEach>
        </form:select>

        <form:select class="select" path="unitId">
          <c:forEach items="${inventoryDAO.units}" var="im">
            <option value="${im.id}">${im.name}</option>
          </c:forEach>
        </form:select>

        <form:input type="number" id="quantity" name="quantity" min="1" class="input-text" placeholder="Cantidad" path="amount"/>
        <input class="btn" id="btn-submit" type="submit" value="Agregar"/>
    </form:form>
      <table>
        <thead>
          <tr>
            <th class="tb-header">ID</th>
            <th class="tb-header">Nombre</th>
            <th class="tb-header">Proveedor</th>
            <th class="tb-header">Cantidad</th>
            <th class="tb-header">Medida</th>
            <th class="tb-header" style="text-align:center">Acciones</th>
          </tr>
        </thead>
          <tbody>
            <%--@elvariable id="inventoryDAO" type="com.project.restaurant.models.InventoryDAO"--%>
            <c:forEach items="${inventoryDAO.inventories}" var="inv">
              <tr>
                  <%--@elvariable id="order" type="Order"--%>
                <form:form
                        modelAttribute="outInventory"
                        method="POST"
                        action="/remove_inventory"
                >
                  <td class="td-item">
                    <form:input path="id" readonly="true" value="${inv.id}" style="width: 20px; border: none;"/>
                  </td>
                  <td class="td-item">${inv.name}</td>
                  <td class="td-item">${inv.provider}</td>
                  <td class="td-item" style="text-align: center;">${inv.amount}</td>
                  <td class="td-item">${inv.unit}</td>
                  <td class="td-item" style="text-align:center">
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