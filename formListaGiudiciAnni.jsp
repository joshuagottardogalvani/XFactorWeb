<!DOCTYPE html>
<html>
    <head>
        <title>Lista dei giudici per anni</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://fonts.googleapis.com/css?family=Jura:400,700" rel="stylesheet">

    <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body>
    <div class="header">
        <img src="img/logo.png" alt="XFactor" width="300px" height="auto">
    </div>

    <h1 id="titolo">LISTA GIUDICI PER ANNI</h1>
        <form action=listaGiudiciAnni method=POST id="titolo" style="font-size: 25px">
            Inserisci l'eta dalla quale vuoi visualizzare i giudici:
            <br>
            <input type=text name=anni /><br>
            <br>
            <input type=submit value=Invio />
        </form>
    </body>
</html>