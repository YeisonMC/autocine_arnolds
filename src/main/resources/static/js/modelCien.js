// Espera a que el documento esté listo
$(document).ready(function () {
  // Agrega un evento de clic al enlace
  $(".icon-informacion").click(function () {
    // Muestra el modal
    $("#informacionModal").modal("show");
  });
});
