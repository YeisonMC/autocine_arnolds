function realizarBusqueda(consulta) {
  // Obtén todos los elementos que deseas buscar, por ejemplo, elementos de una lista.
  const elementos = document.querySelectorAll(".elemento-busqueda"); // Asegúrate de tener elementos con la clase "elemento-busqueda".

  // Itera a través de los elementos y muestra u oculta según la búsqueda.
  elementos.forEach(function (elemento) {
    const textoElemento = elemento.textContent.toLowerCase(); // Obtén el texto del elemento en minúsculas.
    const consultaMinusculas = consulta.toLowerCase(); // Convierte la consulta en minúsculas.

    if (textoElemento.includes(consultaMinusculas)) {
      elemento.style.display = "block"; // Muestra el elemento si la consulta está presente en el texto.
    } else {
      elemento.style.display = "none"; // Oculta el elemento si no coincide con la consulta.
    }
  });
}
