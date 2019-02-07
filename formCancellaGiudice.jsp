<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="img/logo.png">
        <title>Cancella un giudice</title>
        <link href="https://fonts.googleapis.com/css?family=Jura:400,700" rel="stylesheet">
        <style>
        @CHARSET "UTF-8";
        body, html {
            font-family: 'Jura', sans-serif;
            margin: 0;
            color: white;
            font-size: 1.3em;
        }
        
        body {
            background-image: url(/img/sfondo.jpeg);
            height: 100%;
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
        }
        
        .header {
            width: 100%;
            padding-top: 20px;
            text-align: center;
        }
        
        .header > a > img {
            width: 200px;
        }
        
        .container {
            text-align: center;
        }
        .input{
            height: 20px;
            width: 200px;
        }
        .invio {
            margin-top: 25px;
            background-color: rgba(176, 5, 8, 0.9);
            width: 200px;
            height: 75px;
            border: none;
            color:white;
            font-family: 'Jura', 'sans-serif';
            font-size: 1.2em;
            border-radius: 15px;
        }
        </style>
    </head>
    <body>
        <div class="header">
            <a href="index.jsp"><img src="img/logo.png" alt="XFactor" width="300px" height="auto"></a>
        </div>
        
        <div class="container">
        <h3>Inserisci il cognome del giudice da cancellare:</h3>
        <form class="test" action=cancellaGiudice method=POST>
            <input class="input" type=text name=cognome /><br>
            <input class="invio" type=submit value=Invio />
        </form>
        </div>
    </body>
</html>