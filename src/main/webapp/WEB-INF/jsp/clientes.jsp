<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="client.css"/>
  <title>Clientes</title>
</head>
<body>
  <main>
    <div id="crud-container">
      <span id="title-page">Administrador de clientes</span>
      <div id="form-container">
        <input class="input-text" placeholder="Nombre" type="text"/>
        <input class="input-text" placeholder="Telefono" type="text"/>
        <input class="input-text" placeholder="Direccion" type="text"/>
        <button class="btn" id="btn-submit" type="submit">Agregar</button>
      </div>
      <table>
        <tr>
          <th class="tb-header">Nombre</th>
          <th class="tb-header">Telefono</th>
          <th class="tb-header">Direcciones</th>
          <th class="tb-header" style="text-align:center">Acciones</th>
        </tr>
        <tr class="content-body">
          <td class="td-item">Fabian Vargas</td>
          <td class="td-item">85859875</td>
          <td class="td-item">Buenos Aires, Costa Rica</td>
          <td class="td-item">
            <button class="btn" id="btn-edit">Editar</button>
            <button class="btn" id="btn-dir">Direccion</button>
            <button class="btn" id="btn-remove">Borrar</button>
          </td>
        <tr/>
      </table>
    </div>
  </main>
</body>
</html>