<div class="navbar navbar-default">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
      <a class="navbar-brand" href="<%= request.getContextPath()%>/home"><span class="glyphicon glyphicon-home" ></span>&nbsp;Scrumbrella</a>
  </div>
  <div class="navbar-collapse collapse navbar-responsive-collapse">
    <ul class="nav navbar-nav">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Categor&iacute;as <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="#frmNewCat" data-toggle="modal">Agregar</a></li>
          <li><a href="#frmModCat" data-toggle="modal">Modificar</a></li>
          <li class="divider"></li>
          <li class="dropdown-header text-warning">Precauci&oacute;n!</li>
          <li><a href="#frmDelCat" data-toggle="modal">Eliminar</a></li>
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">${requestScope['usuario']} <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="#">Modificar Perfil</a></li>
            <li><a href="#">Ayuda</a></li>
            <li><a href="#">Reportar Problema</a></li>
            <li class="divider"></li>
            <li><a href="#">Cerrar Sesi&oacute;n</a></li>
        </ul>
      </li>
    </ul>
  </div>
</div>
       