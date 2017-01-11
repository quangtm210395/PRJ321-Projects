var sliderButtons;
var menuBarButtons;
var crumbNavLink;
var sliderContent, sliderImage, sliderName, sliderDescription;
var sliderTimeouts, sliderInterval;
var sliderModels = [
  {
    "name": "Samsung GX 2004 LM",
    "description": "Samsung GX 2004 LM",
    "imageURL": "images/laptop.png"
  },
  {
    "name": "Apple iPhone",
    "description": "Apple iPhone",
    "imageURL": "images/iphone.png"
  },
  {
    "name": "Motorola 156 MX-VL",
    "description": "Motorola 156 MX-VL",
    "imageURL": "images/p1.gif"
  },
  {
    "name": "Laptop 2",
    "description": "Laptop 2",
    "imageURL": "images/p2.gif"
  },
  {
    "name": "Samsung Webcam",
    "description": "Samsung Webcam",
    "imageURL": "images/camera.png"
  }
];

function updateSlider(index) {
  // Update slider's buttons
  for (var  i = 0; i < sliderButtons.length; i++)
    if (sliderButtons[i].classList.contains('selected-button')) {
      sliderButtons[i].classList.remove('selected-button');
    }
  sliderButtons[index].classList.add('selected-button');

  // Play fade animation (1s), also update slider's content after 500ms
  sliderContent.classList.add('slider-fade');
  setTimeout(function() {
    sliderImage.src = sliderModels[index].imageURL;
    sliderName.innerHTML = sliderModels[index].name;
    sliderDescription.innerHTML = sliderModels[index].description;
  }, 500);

  // Remove fade animation class & reset sliderContent
  setTimeout(function() {
    sliderContent.classList.remove('slider-fade');
    void sliderContent.offsetWidth;
  }, 1000);
}

function playSliderOnce() {
  sliderTimeouts = [];
  for (i = 0; i < sliderButtons.length; i++) {
    sliderTimeouts.push(setTimeout(function(index) {
      return function() { updateSlider(index); }
    } (i), i * 2000));
  }
}

function playSliderInfinite() {
  sliderInterval = setInterval(function() {
    playSliderOnce();
  }, sliderButtons.length * 2000);
  playSliderOnce();
}

function stopSlider() {
  clearInterval(sliderInterval);
  for (var i = 0; i < sliderTimeouts.length; i++) {
    clearTimeout(sliderTimeouts[i]);
  }
}

function sliderButtonClick(index) {
  stopSlider();
  updateSlider(index);
}

function menuBarButtonClick(index) {
  crumbNavLink.innerText = menuBarButtons[index].innerText;
}

function initializeSliderContent() {
  sliderContent = document.getElementById('slider-content');
  sliderImage = document.getElementById('slider-image').getElementsByTagName('IMG')[0];
  sliderName = document.getElementById('slider-name');
  sliderDescription = document.getElementById('slider-description');
}

function initializeSliderButtons() {
  sliderButtons = [];
  var itemList = document.getElementById('slider-pagination-buttons').getElementsByTagName('LI');
  var childA, button;
  for (var i = 0; i < itemList.length; i++) {
    childA = itemList[i].getElementsByTagName('A');
    if (childA.length > 0) {
      button = childA[0];
      button.onclick = function(index) {
        return function() { sliderButtonClick(index) };
      } (sliderButtons.length);
      sliderButtons.push(button);
    }
  }
}

function initializeMenuBarButtons() {
  menuBarButtons = [];
  var itemList = document.getElementById('menu-bar-buttons').getElementsByTagName('LI');
  var childA, button;
  for (var i = 0; i < itemList.length; i++) {
    childA = itemList[i].getElementsByTagName('A');
    if (childA.length > 0) {
      button = childA[0];
      button.onclick = function(index) {
        return function() { menuBarButtonClick(index) };
      } (menuBarButtons.length);
      menuBarButtons.push(button);
    }
  }
}

function initializeNavLink() {
  crumbNavLink = document.getElementById('crumb-navigation-link');
}

function initialize() {
  initializeSliderContent();
  initializeNavLink();
  initializeSliderButtons();
  initializeMenuBarButtons();
  menuBarButtonClick(0);
  playSliderInfinite();
}

