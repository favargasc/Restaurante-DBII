<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    margin-top: 1rem;
    text-align: left;
    font-size: 24px;
  }

  .recipe-title {
    font-weight: bold;
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

  .img {
    width: 20rem;
    height: 12rem;
    margin: auto;
  }

  #img-2 {
    position: relative;
    right: 6px;

    margin-top: 2.3rem;
  }
  .space {
    padding-right: 9rem;
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
      <%--@elvariable id="menu" type="java.util.List"--%>
      <c:forEach items="${menu.mains}" var="m">
        <div class="recipe-detail">
          <span class="recipe-title space">${m.title}</span>
          <span class="recipe-title">${m.price}</span>
          <span class="recipe-text">${m.detail}</span>
        </div>
      </c:forEach>
    </div>

    <div class="item">
      <span class="section-title">Especiales</span>
        <%--@elvariable id="menu" type="java.util.List"--%>
        <c:forEach items="${menu.specials}" var="e">
          <div class="recipe-detail">
            <span class="recipe-title space">${e.title}</span>
            <span class="recipe-title">${e.price}</span>
            <span class="recipe-text">${e.detail}</span>
          </div>
        </c:forEach>
    </div>

    <div class="item">
      <span class="section-title">Postres</span>
      <ul>
        <c:forEach items="${menu.desserts}" var="p">
          <li class="recipe-list"><span> ${p.title} ${p.price}</span></li>
        </c:forEach>
      </ul>
    </div>
    <div id="img-2" class="item">
      <img src="assets/menu_img2.png" alt="menu food"/>
    </div>
    <div class="item">
      <span class="section-title">Bebidas</span>
      <ul>
        <c:forEach items="${menu.drinks}" var="b">
          <li class="recipe-list"><span> ${b.title} ${b.price}</span></li>
        </c:forEach>
      </ul>
    </div>
    <div class="item">
      <span class="section-title">Acompanamientos</span>
      <ul>
        <c:forEach items="${menu.sides}" var="s">
          <li class="recipe-list"><span> ${s.title} ${s.price}</span></li>
        </c:forEach>
      </ul>
    </div>
  </main>
</body>
</html>