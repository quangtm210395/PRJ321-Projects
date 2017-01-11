var sliderButtons;
var itemList;

function initializeSliderButtons() {
    sliderButtons = [];
    itemList = document.getElementById('pagination-buttons').getElementsByTagName('LI');
    var childA, button;
    for (var i = 1; i < itemList.length - 1; i++) {
        childA = itemList[i].getElementsByTagName('A');
        if (childA.length > 0) {
            button = childA[0];
            button.onclick = function(index) {
                return function() {
                    sliderButtonClick(index);
                };
            }(sliderButtons.length);
            sliderButtons.push(button);
        }
    }
    updatePagination();
}

function updateSlider(index) {
    for (var i = 1; i < itemList.length - 1; i++) {
        if (itemList[i].classList.contains('active')) {
            itemList[i].classList.remove('active');
        }
        itemList[index].classList.add('active');
    }
    // Update slider's buttons
    // for (var  i = 0; i < sliderButtons.length; i++)
    //   if (sliderButtons[i].classList.contains('selected-button')) {
    //     sliderButtons[i].classList.remove('selected-button');
    //   }
    // sliderButtons[index].classList.add('selected-button');

}

function sliderButtonClick(index) {
    // updateSlider(index);
}

function getRequests() {
    var s1 = location.search.substring(1, location.search.length).split('&'),
        r = {},
        s2, i;
    for (i = 0; i < s1.length; i += 1) {
        s2 = s1[i].split('=');
        r[decodeURIComponent(s2[0]).toLowerCase()] = decodeURIComponent(s2[1]);
    }
    return r;
};

function Request(name) {
    var QueryString = getRequests();
    return QueryString[name.toLowerCase()];
}

function updatePagination() {
    var pagi = Request("pagi");
    if (pagi == null) {
        updateSlider(1);
    } else
        updateSlider(pagi);
}
