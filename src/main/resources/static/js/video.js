document.addEventListener("DOMContentLoaded", function () {
  const openVideoButton = document.getElementById("open-video");
  const closeVideoButton = document.getElementById("close-video");
  const videoPopup = document.getElementById("video-popup");
  const videoIframe = document.getElementById("video-iframe");
  // const videoUrl =
  //   "https://www.youtube.com/embed/XAjf55_ALoM?si=4zm41L6H5qFpcBZZ";

  openVideoButton.addEventListener("click", function () {
    // videoIframe.src = videoUrl;
    videoPopup.style.display = "block";
  });

  closeVideoButton.addEventListener("click", function () {
    videoIframe.src = "";
    // videoIframe.src = videoUrl;  Restablece la URL con ?autoplay=0
    videoPopup.style.display = "none";
  });
});
