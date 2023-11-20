document.addEventListener("DOMContentLoaded", function () {
  const chkCartelera = document.getElementById("chkCartelera");
  const chkProximamente = document.getElementById("chkProximamente");
  const chkAdministrador = document.getElementById("chkAdministrador");
  const contenidoFiltro = document.getElementById("contenidoFiltro");
  const contenidoCartelera = document.getElementById("contenidoCartelera");
  const contenidoProximamente = document.getElementById(
    "contenidoProximamente"
  );
  const contenidoAdministrador = document.getElementById(
    "contenidoAdministrador"
  );

  document.getElementById("btnAplicar").addEventListener("click", function () {
    if (
      chkCartelera.checked &&
      !chkProximamente.checked &&
      !chkAdministrador.checked
    ) {
      // Mostrar contenido de Cartelera
      contenidoCartelera.style.display = "block";
      contenidoProximamente.style.display = "none";
      contenidoAdministrador.style.display = "none"; // Ocultar contenido de Administrador
      contenidoFiltro.style.display = "none";
    } else if (
      !chkCartelera.checked &&
      chkProximamente.checked &&
      !chkAdministrador.checked
    ) {
      // Mostrar contenido de Próximamente
      contenidoCartelera.style.display = "none";
      contenidoProximamente.style.display = "block";
      contenidoAdministrador.style.display = "none"; // Ocultar contenido de Administrador
      contenidoFiltro.style.display = "none";
    } else if (
      !chkCartelera.checked &&
      !chkProximamente.checked &&
      chkAdministrador.checked
    ) {
      // Mostrar contenido de Administrador
      contenidoCartelera.style.display = "none";
      contenidoProximamente.style.display = "none";
      contenidoAdministrador.style.display = "block";
      contenidoFiltro.style.display = "none";
    } else {
      // Mostrar contenido general
      contenidoCartelera.style.display = "none";
      contenidoProximamente.style.display = "none";
      contenidoAdministrador.style.display = "none";
      contenidoFiltro.style.display = "block";
    }
  });

  document
    .getElementById("btnEliminarFiltro")
    .addEventListener("click", function () {
      // Restablecer a la vista general
      chkCartelera.checked = false;
      chkProximamente.checked = false;
      chkAdministrador.checked = false;
      contenidoCartelera.style.display = "none";
      contenidoProximamente.style.display = "none";
      contenidoAdministrador.style.display = "none";
      contenidoFiltro.style.display = "block";
    });
});
