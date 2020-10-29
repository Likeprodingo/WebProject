function dateValidation() {
    new Intl.DateTimeFormat();
    let dates = $('input[type=date]');
    let dateNow = new Date().toDateLocal();

    dates.on('focus', function () {
        let date = $(this);
        date.attr('min', dateNow);
    })
};

Date.prototype.toDateLocal =
    function toDatetimeLocal() {
        var
            date = this,
            ten = function (i) {
                return (i < 10 ? '0' : '') + i;
            },
            YYYY = date.getFullYear(),
            MM = ten(date.getMonth() + 1),
            DD = ten(date.getDate())
        ;
        return YYYY + '-' + MM + '-' + DD;
    };

function toggleSet() {
    if (document.getElementById("cargo").checked) {
        document.getElementById("cargo_set").style.display = 'block';
        document.getElementById("passenger_set").style.display = 'none';
    } else if (document.getElementById("passenger").checked) {
        document.getElementById("cargo_set").style.display = 'none';
        document.getElementById("passenger_set").style.display = 'block';
    } else {
        document.getElementById("cargo_set").style.display = 'none';
        document.getElementById("passenger_set").style.display = 'none';
    }
};

$(document).ready(function () {

    let docHeight = $(window).height();
    let footerHeight = $('#footer').height();
    let footerTop = $('#footer').position().top + footerHeight;

    if (footerTop < docHeight)
        $('#footer').css('margin-top', 0 + (docHeight - footerTop) + 'px');

    dateValidation();
    toggleSet();
});

document.addEventListener('keydown', (event) => {
    if (event.keyCode === 116) event.preventDefault();
});