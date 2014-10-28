<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Recurso no encontrado</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/bootstrap.min.cyborg.css" type="text/css" media="screen">
    <link href="<%= request.getContextPath()%>/css/iconFont.css" rel="stylesheet" type="text/css" >
    <link href="<%= request.getContextPath()%>/css/index.css" rel="stylesheet" type="text/css">
    <style>
        .error-template {padding: 40px 15px;text-align: center;}
.error-actions {margin-top:15px;margin-bottom:15px;}
.error-actions .btn { margin-right:10px; }
        
    </style>
</head>
    <body>
        <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="error-template">
                <h1>
                    Oops!</h1>
                <h2>Error 404</h2>
                <div class="error-details">
                    No se ha encontrado lo que buscabas.
                </div>
                <div class="error-actions">
                    <a href="<%= request.getContextPath()%>/home" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-home"></span> Ir a inicio </a>
                </div>
            </div>
        </div>
    </div>
</div>

    </body>
</html>
