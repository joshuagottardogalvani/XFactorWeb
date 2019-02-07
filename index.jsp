<!DOCTYPE html>
<html>

<head>
    <title>Home Page</title>

    <link rel="icon" href="img/logo.png">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://fonts.googleapis.com/css?family=Jura:400,700" rel="stylesheet">

    <link rel="stylesheet" href="css/style.css" type="text/css">

</head>

<body>

    <div class="header">
        <img src="img/logo.png" alt="XFactor" width="300px" height="auto">
    </div>

    <h1 id="titolo">BENVENUTI SUL SITO DI XFACTOR</h1>

    <div class="container-bottoni">
        <div class="div-bottoni">
            <button class="bottone" onclick="window.location.href ='/listaGiudici';">
                <h3>Lista dei giudici.</h3>
            </button>
        </div>
        <div id="btn2" class="div-bottoni">
            <button class="bottone" onclick="window.location.href ='/luogoNascitaGiudici';">
                <h3>Ricerca giudici per luogo di nascita.</h3>
            </button>
        </div>
        <div id="btn3" class="div-bottoni">
            <button class="bottone" onclick="window.location.href ='/inserisciGiudice';">
                <h3>Inserimento di un nuovo giudice.</h3>
            </button>
        </div>
        <div id="btn4" class="div-bottoni">
            <button class="bottone" onclick="window.location.href ='/cancellaGiudice';">
                <h3>Cancellazione di un giudice dato il cognome.</h3>
            </button>
        </div>
        <div id="btn5" class="div-bottoni">
            <button class="bottone" onclick="window.location.href ='/listaGiudiciAnni';">
                <h3>Lista giudici che hanno piu di TOT anni.</h3>
            </button>
        </div>
        <div id="btn6" class="div-bottoni">
            <button class="bottone" onclick="window.location.href ='/cambiaLuogo';">
                <h3>Cambia il luogo di nascita di un giudice.</h3>
            </button>
        </div>
    </div>

</body>

</html>