<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<style>
    * {
        padding: 0;
        margin: 0;
        box-sizing: border-box;
    }

    body {
        background-color: #c2c2c2;
    }

    main {
        padding-top: 4rem;
        width: 30vw;
        height: 70vh;
        background-color: white;
        margin: 10vh auto;
        border-radius: 5px;
    }

    input {
        display: block;
        margin: 3rem auto;
    }

    span {
        font-size: 2rem;
        text-align: center;
        font-family: "Roboto", -apple-system, BlinkMacSystemFont, "Segoe UI",
        Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif,
        "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
        display: block;
    }

    .btn {
        text-align: center;
        padding: 0.3rem 1rem;
        border-radius: 5px;
        border: 1px solid;
    }

    #btn-remove {
        border-color: #8a0f0f;
        background-color: hsl(0, 80%, 80%);
        color: #8a0f0f;
    }

    .input-text {
        border: solid 1px;
        border-radius: 5px;
        height: 1.5rem;
        text-indent: 0.5rem;
    }

</style>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <main>
        <span class="text">
            Login Restaurante
        </span>
        <form:form
        modelAttribute="login"
        method="POST"
        action="/getLogin"
        >
            <form:input class="input-text" placeholder="Username" type="text" path="userName"/>
            <form:input class="input-text" placeholder="Password" type="text" path="password"/>
            <input class="btn" id="btn-remove" type="submit" value="Login"/>
        </form:form>
    </main>
</body>
</html>