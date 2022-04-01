<style>
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }


  body {
    background-color: hsl(0, 0%, 9%);
    font-family: 'Abel', sans-serif;
    color: white;
  }

  #menu-container  {
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    grid-template-rows: 0.4fr 1.5fr 0.8fr 1fr;
    justify-content: center;
    width: 65%;
    padding: 3rem 3rem;
    margin: 2rem auto;
    border-radius: 10px;
    font-family: var(--tb-ft-family);
    background-color: #030202;

  }

  .item {
    text-align: center;
    padding-bottom: 2rem;
  }

  .section-title {
    font-size: 42px;
  }

  .recipe-detail {
    text-align: left;
    font-size: 24px;
  }

  .recipe-title {
    font-weight: bold;

  }

  .recipe-title::after {
    margin-left: 10rem;
    content: "5000";
  }

  .recipe-text {
    font-size: 20px;
  }

  .recipe-list {
    text-align: left;
    font-size: 22px;
  }

  li {
    list-style: none;
  }

  #img-2 {
    position: relative;
    right: 6px;

    margin-top: 2.3rem;
  }

</style>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://fonts.googleapis.com/css2?family=Abel&display=swap" rel="stylesheet">
  <title>Menu</title>
</head>
<body>
  <main id="menu-container">
    <img class="img" src="assets/menu_name.png" alt="menu name"/>
    <img class="img" src="assets/menu_img.png" alt="menu food"/>
    <div class="item">
      <span class="section-title">Principales</span>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
    </div>
    <div class="item">
      <span class="section-title">Especiales</span>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
      <div class="recipe-detail">
        <span class="recipe-title">Ensalada Griega</span>
        <span class="recipe-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.</span>
      </div>
    </div>
    <div class="item">
      <span class="section-title">Postres</span>
      <ul>
        <li class="recipe-list"><span>Papas Fritas ...................................... 5000</span></li>
        <li class="recipe-list"><span>Papas a la Pimienta ......................... 5000</span></li>
        <li class="recipe-list"><span>Casado ............................................... 5000</span></li>
        <li class="recipe-list"><span>Porcion de Pollo ................................ 5000</span></li>
        <li class="recipe-list"><span>Gallopinto .......................................... 5000</span></li>
        <li class="recipe-list"><span>Empanada ......................................... 5000</span></li>
        <li class="recipe-list"><span>Ensalada Verde ................................. 5000</span></li>
      </ul>
    </div>
    <div id="img-2" class="item">
      <img src="assets/menu_img2.png" alt="menu food"/>
    </div>
    <div class="item">
      <span class="section-title">Bebidas</span>
      <ul>
        <li class="recipe-list"><span>Papas Fritas ...................................... 5000</span></li>
        <li class="recipe-list"><span>Papas a la Pimienta ......................... 5000</span></li>
        <li class="recipe-list"><span>Casado ............................................... 5000</span></li>
        <li class="recipe-list"><span>Porcion de Pollo ................................ 5000</span></li>
        <li class="recipe-list"><span>Gallopinto .......................................... 5000</span></li>
        <li class="recipe-list"><span>Empanada ......................................... 5000</span></li>
        <li class="recipe-list"><span>Ensalada Verde ................................. 5000</span></li>
      </ul>
    </div>
    <div class="item">
      <span class="section-title">Acompanamientos</span>
      <ul>
        <li class="recipe-list"><span>Papas Fritas ...................................... 5000</span></li>
        <li class="recipe-list"><span>Papas a la Pimienta ......................... 5000</span></li>
        <li class="recipe-list"><span>Casado ............................................... 5000</span></li>
        <li class="recipe-list"><span>Porcion de Pollo ................................ 5000</span></li>
        <li class="recipe-list"><span>Gallopinto .......................................... 5000</span></li>
        <li class="recipe-list"><span>Empanada ......................................... 5000</span></li>
        <li class="recipe-list"><span>Ensalada Verde ................................. 5000</span></li>
      </ul>
    </div>
  </main>
</body>
</html>