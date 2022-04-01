<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="client.css"/>
  <link rel="stylesheet" href="proveedores.css"/>
  <title>Proveedores</title>
</head>
<body>
  <main>
    <div id="container">
      <span id="title-page">Administrador de Proveedores</span>
      <div id="form-container">
        <input class="input-text" placeholder="Nombre" type="text"/>
        <button class="btn" id="btn-submit" type="submit">Agregar</button>
      </div>
      <table>
        <tr>
          <th class="tb-header">ID</th>
          <th class="tb-header">Nombre</th>
          <th class="tb-header" style="text-align:center">Acciones</th>
        </tr>
        <tr class="content-body">
          <td class="td-item">1</td>
          <td class="td-item">Fabian Vargas</td>
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