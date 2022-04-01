<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="client.css"/>
  <link rel="stylesheet" href="ordenes.css"/>
  <title>Clientes</title>
</head>
<body>
  <main>
    <div id="container">
      <span id="title-page">Administrador de Ordenes</span>
      <div id="form-container">
        <input class="input-text" placeholder="Nombre" type="text"/>
        <input class="input-text" placeholder="Fecha" type="text"/>
        <input class="input-text" placeholder="Platillo" type="text"/>

        <select id="select">
          <option value="1" selected>Al Contado</option>
          <option value="2">Tarjeta</option>
          <option value="3">Simpe Móvil</option>
        </select>

        <input class="input-text" placeholder="Cantidad" type="text"/>
        <button class="btn" id="btn-submit" type="submit">Agregar</button>
      </div>
      <table>
        <tr>
          <th class="tb-header">Cliente</th>
          <th class="tb-header">Fecha</th>
          <th class="tb-header">Platillo</th>
          <th class="tb-header">Metodo de Pago</th>
          <th class="tb-header">Cantidad</th>
          <th class="tb-header" style="text-align:center">Acciones</th>
        </tr>
        <tr class="content-body">
          <td class="td-item">Fabian Vargas</td>
          <td class="td-item">31/03/2022</td>
          <td class="td-item">Casado</td>
          <td class="td-item">Tarjeta</td>
          <td class="td-item">2</td>
          <td class="td-item">
            <button class="btn" id="btn-edit">Editar</button>
            <button class="btn" id="btn-remove">Borrar</button>
          </td>
        <tr/>
      </table>
    </div>
  </main>
</body>
</html>