$(document).ready(function () {
  $("#carrusel .carrusel").slick({
    slidesToShow: 5,
    slidesToScroll: 1,
    prevArrow: $(".left-arrow"),
    nextArrow: $(".right-arrow"),
  });
});
