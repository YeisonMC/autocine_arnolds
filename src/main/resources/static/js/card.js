document.addEventListener("DOMContentLoaded", function () {
  const carrusel = document.querySelector(".carrusel");
  const carruselItems = document.querySelectorAll(".carrusel-item");
  const carruselPrev = document.querySelector(".carrusel-prev");
  const carruselNext = document.querySelector(".carrusel-next");

  let currentIndex = 0;

  // Función para mover el carrusel hacia la izquierda
  function slideLeft() {
    if (currentIndex > 0) {
      currentIndex--;
    } else {
      currentIndex = carruselItems.length - 5; // Regresar al último conjunto de elementos
    }
    updateCarrusel();
  }

  // Función para mover el carrusel hacia la derecha
  function slideRight() {
    if (currentIndex < carruselItems.length - 5) {
      currentIndex++;
    } else {
      currentIndex = 0; // Regresar al inicio
    }
    updateCarrusel();
  }

  // Actualiza la vista del carrusel
  function updateCarrusel() {
    const itemWidth = carruselItems[0].offsetWidth;
    const translateX = -currentIndex * itemWidth;
    carrusel.style.transform = `translateX(${translateX}px)`;
  }

  // Agrega eventos a las flechas de navegación
  carruselPrev.addEventListener("click", slideLeft);
  carruselNext.addEventListener("click", slideRight);
});
