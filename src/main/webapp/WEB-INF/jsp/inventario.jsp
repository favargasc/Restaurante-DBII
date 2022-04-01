<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="client.css"/>
  <link rel="stylesheet" href="inventario.css"/>
  <title>Clientes</title>
</head>
<body>
  <main>
    <div id="container">
      <span id="title-page">Administrador de Inventario</span>
      <form id="form-container">
        <input class="input" placeholder="Nombre" type="text"/>

        <select id="select">
          <option value="1" selected>Del Valle</option>
          <option value="2">Bimbo</option>
          <option value="3">Dos Pinos</option>
          <option value="4">hellmann's</option>
        </select>
        
        <select id="select">
          <option value="1" selected>Unidades</option>
          <option value="2">Kilogramos</option>
          <option value="3">Gramos</option>
          <option value="4">Onzas</option>
        </select>
        
        <input class="input" placeholder="Cantidad" type="text"/>
        <button class="btn" id="btn-submit" type="submit">Agregar</button>
    </form>
      <table>
        <tr>
          <th class="tb-header">ID</th>
          <th class="tb-header">Nombre</th>
          <th class="tb-header">Proveedor</th>
          <th class="tb-header">Cantidad</th>
          <th class="tb-header">Medida</th>
          <th class="tb-header" style="text-align:center">Acciones</th>
        </tr>
        <tr class="content-body">
          <td class="td-item">1</td>
          <td class="td-item">Aguacate</td>
          <td class="td-item">Del Valle</td>
          <td class="td-item">20</td>
          <td class="td-item">Unidades</td>
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