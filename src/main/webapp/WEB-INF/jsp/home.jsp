<style>
  :root {
    --home-bg-color: #f6f6f6;
    --font-color: #888888;
    --sidebar-ft-family: "Roboto", -apple-system, BlinkMacSystemFont, "Segoe UI",
    Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif,
    "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
  }

  * {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
  }

  html,
  body {
    height: 100%;
  }

  body {
    background-color: var(--home-bg-color);
    font-family: var(--sidebar-ft-family);
  }

  #home-navigation {
    padding-top: 4vh;
    text-align: center;
  }

  #home-navigation a {
    position: relative;
    margin: 4vh;
    text-decoration: none;
    font-weight: bold;
    color: var(--font-color);
  }

  #home-navigation a:hover {
    color: #000000;
  }

  #home-navigation a:before {
    content: "";
    position: absolute;
    width: 100%;
    height: 0.2em;
    bottom: 0;
    left: 0;
    top: 1.5em;
    background-color: rgb(190, 75, 75);
    visibility: hidden;
    transform: scaleX(0);
    transition: all 0.3s ease-in-out;
  }

  #home-navigation a:hover:before {
    visibility: visible;
    transform: scaleX(1);
  }

  #img-home-food {
    position: absolute;
    left: 750px;
    top: 100px;
    width: 500px;
    height: 300px;
    transform: rotate(-2deg);
  }

  #slogan-block {
    width: 50rem;
    height: 20rem;
    padding: 8rem 5rem;
    text-align: center;
  }

  .slogan-text {
    display: block;
    font-size: 3rem;
  }

  #popular-meals-menu {
    display: grid;
    justify-content: center;
    grid-gap: 4rem;
    padding-top: 1rem;
    grid-template-columns: repeat(5, 8rem);
  }

  #popular-meals {
    padding-top: 2rem;
    text-align: center;
  }

  #popular-meals-title {
    text-align: center;
    color: rgb(190, 75, 75);
    font-size: 1.2em;
    font-weight: bold;
  }

  .menu-item {
    width: 10rem;
    height: 9rem;
  }
  .popular-meals {
    width: 10rem;
    height: 9rem;
  }
</style>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
</head>
<body>
  <main>
    <header>
      <nav id="home-navigation">
        <a href="menu">Menu</a>
        <a href="clientes">Clientes</a>
        <a href="ordenes">Ordenes</a>
        <a href="inventario">Inventario</a>
        <a href="proveedores">Proveedores</a>
      </nav>
    </header>

    <article id="slogan-block">
      <span class="slogan-text">Pide tu comida favorita</span>
      <span class="slogan-text">cuando quieras</span>
    </article>

    <article>
      <img id="img-home-food" src="assets/home_food.png" width="500px" height="400px" alt="home-food"/>
    </article>

    <article id="popular-meals">
      <span id="popular-meals-title">Platillos populares</span>
      <div id="popular-meals-menu">
        <div class="popular-meals">
          <img  class="menu-item" src="assets/food-1.jpg" alt="food-1"/>
        </div>
        <div class="popular-meals">
          <img  class="menu-item" src="assets/food-2.jpg" alt="food-2"/>
        </div>
        <div class="popular-meals">
          <img  class="menu-item" src="assets/food-3.jpg" alt="food-3"/>
        </div>
        <div class="popular-meals">
          <img  class="menu-item" src="assets/food-4.jpg" alt="food-4"/>
        </div>
        <div class="popular-meals">
          <img  class="menu-item" src="assets/food-5.jpg" alt="food-5"/>
        </div>
      </div>
    </article>
  </main>
</body>
</html>