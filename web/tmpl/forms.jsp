<!-- Modal -->
<div class="modal fade" id="frmNewCat" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header success">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title text-info" id="myModalLabel">Agregar Categoría</h4>
      </div>
      <div class="modal-body">
          <form role="form" action="<%= request.getContextPath() %>/home" method="post" id="fNC">
            <div class="form-group">
                <label for="frmNewName">Nombre</label>
                <input type="text" id="frmNewName" name="frmNewName" class="form-control" required size="100">
            </div>
            <div class="form-group float-label-control">
                <label for="frmNewDesc">Descripción</label>
                <textarea class="form-control" id="frmNewDesc" name="frmNewDesc" rows="2" cols="55" required></textarea>
            </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
        <button type="submit" class="btn btn-success" form="fNC">Crear Categoría</button>
      </div>
    </div>
  </div>
</div>



<!-- Modal -->
<div class="modal fade" id="frmDelCat" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header success">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title text-danger" id="myModalLabel">Eliminar Categoría</h4>
      </div>
      <div class="modal-body">
          <h2 class="text-warning">Esta acción no se puede deshacer!</h2>
          <form role="form" id="fDC" method="post" action="<%= request.getContextPath() %>/home">
            <div class="form-group">
                <span class="help-block">Seleccione la categoría a ser eliminada.</span>
                <select id="sltcat" name="sltCatDel" onchange="">
                    <option disabled="">Seleccionar...</option>
                    <option>Lacteos</option>
                    <option>Carnes</option>
                    <option>Embutidos</option> 
                </select>
            </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
        <button type="submit" class="btn btn-danger" form="fDC">Eliminar Categoría</button>
      </div>
    </div>
  </div>
</div>

            <!-- Modal -->
<div class="modal fade" id="frmModCat" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header success">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title text-info" id="myModalLabel">Agregar Categoría</h4>
      </div>
      <div class="modal-body">
          <form role="form" action="<%= request.getContextPath() %>/home" method="post" id="fNC">
            <div class="form-group">
                <span class="help-block">Seleccione la categoría a modificar.</span>
                <select id="sltcat" name="sltCatDel">{option:SltCat}</select>
            </div>
            <div class="form-group">
                <label for="frmNewName">Nombre</label>
                <input type="text" id="frmNewName" name="frmNewName" class="form-control" required size="100">
            </div>
            <div class="form-group float-label-control">
                <label for="frmNewDesc">Descripción</label>
                <textarea class="form-control" id="frmNewDesc" name="frmNewDesc" rows="2" cols="55" required></textarea>
            </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
        <button type="submit" class="btn btn-warning" form="fNC">Modificar Categoría</button>
      </div>
    </div>
  </div>
</div>
