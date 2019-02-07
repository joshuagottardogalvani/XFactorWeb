<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        
        <title>Risposta</title>
        
        <link rel="icon" href="img/logo.png">
    
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link href="https://fonts.googleapis.com/css?family=Jura:400,700" rel="stylesheet">
        
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <style>
        @CHARSET "UTF-8";
        body, html {
            font-family: 'Jura', 'sans-serif';
            margin: 0;
            color: white;
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
        
        .risposta {
            text-align: center;
        }
        </style>
    </head>
    <body>
        <div class="header">
            <a href="index.jsp"><img src="img/logo.png" alt="XFactor" width="300px" height="auto"></a>
        </div>
        <br>
        <div class="risposta" id="titolo" style="font-size: 25px">
            <b>${requestScope["message"]}</b>        
        </div>
    </body>
</html>