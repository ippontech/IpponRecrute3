<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Ippon Recrute 3</title>
    <meta name="author" content="Julien Dubois" />
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <style>
        body {
            padding-top: 60px;
            padding-bottom: 40px;
        }
    </style>
    <link rel="stylesheet" href="resources/css/bootstrap-responsive.min.css">
    <link rel="stylesheet" href="resources/css/main.css">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Happy+Monkey">
    <link href="http://fonts.googleapis.com/css?family=Londrina+Shadow" rel="stylesheet">
    <link rel="stylesheet" href="resources/etape1/resolv-the-puzzle.css">

    <script src="resources/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body oncontextmenu="return false;" onload="gameLoop();">
<!--[if lt IE 7]>
<p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
<![endif]-->

<!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li>
                        <a class="brand" href="/">Ippon Recrute 3</a>
                    </li>
                    <li class="active">
                        <a href="/etape1">Etape 1</a>
                    </li>
                    <li>
                        <a href="/etape2">Etape 2</a>
                    </li>
                    <li>
                        <a href="/etape3">Etape 3</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<div class="container">

<section id="howTo">
    <header>Etape 1</header>
    <ul>
        <li>Vous avez 8 pi&egrave;ces &agrave; d&eacute;placer pour reconstituer l'image</li>
        <li>Vous devez r&eacute;ussir &agrave; la reconstituer en 60 coups</li>
        <li>Et vous avez seulement 60 secondes !</li>
    </ul>
    Contr&ocirc;les :<br>
    Utilisez la souris. Cliquez sur une pi&egrave;ce pour qu'elle se d&eacute;place sur la case adjacente, si elle est vide.<br>
    <br>
</section>
	<button id="btnStartGame" onclick="startGame();">Jouer</button>
	<label id="lblEndGame" class="hide">Gagn&eacute; !</label>
	<canvas id="gameScreen" onmousedown="mouse.listenMousedown(event);" onmouseup="mouse.listenMouseup(event);">Votre navigateur n'est pas compatible avec l'&eacute;l&eacute;ment canvas (html5).</canvas>
<section id="gameInfo">
    <header>Informations</header>
    <label id="lblInfo">Cliquez pour "Jouer".</label>
</section>

</div> <!-- /container -->
<script src="resources/etape1/resolv-the-puzzle.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="resources/js/vendor/jquery-1.9.1.min.js"><\/script>')</script>

<script src="resources/js/vendor/bootstrap.min.js"></script>

<script src="resources/js/main.js"></script>

</body>
</html>