(function () {
    $("#tabclientes").on("click", ".js-delete", function () {
        /*alert("clicou")*/
        let botaoclicado = $(this)
        $("#btnsim").attr("data-id", botaoclicado.attr("data-id"))
        $("#modalcliente").modal("show")
    })
    $("#btnsim").on("click", function () {
        let botaosim = $(this)
        let id = botaosim.attr("data-id")
        $.ajax({
            url: "/clientes/delete/" + id,
            method: "GET",
            success: function () {
                window.location.href = "/clientes"
            }
        })
    })
})()

document.getElementById('generatePassword').addEventListener('click', function () {
    const length = document.getElementById('passwordLength').value;
    const includeUppercase = document.getElementById('includeUppercase').checked;
    const includeNumbers = document.getElementById('includeNumbers').checked;
    const includeSymbols = document.getElementById('includeSymbols').checked;
    document.getElementById('exampleInputPassword1').value = generatePassword(length, includeUppercase, includeNumbers, includeSymbols);
});

document.getElementById('savePassword').addEventListener('click', function () {

    var successAnimation = document.getElementById('successAnimation');
    successAnimation.style.display = 'block';


    var modal = bootstrap.Modal.getInstance(document.getElementById('staticBackdrop'));
    modal.hide();


    setTimeout(function () {
        successAnimation.style.display = 'none';
    }, 1500);
});

function generatePassword(length, includeUppercase, includeNumbers, includeSymbols) {
    const lowercase = "abcdefghijklmnopqrstuvwxyz";
    const uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const numbers = "0123456789";
    const symbols = "!@#$%^&*()_+~`|}{[]:;?><,./-=";
    let charset = lowercase;
    if (includeUppercase) charset += uppercase;
    if (includeNumbers) charset += numbers;
    if (includeSymbols) charset += symbols;

    let password = "";
    for (let i = 0, n = charset.length; i < length; ++i) {
        password += charset.charAt(Math.floor(Math.random() * n));
    }
    return password;
}

function togglePasswordVisibility() {
    var passwordField = document.getElementById('exampleInputPassword1');
    if (passwordField.type === 'password') {
        passwordField.type = 'text';
    } else {
        passwordField.type = 'password';
    }
}

function updatePasswordLengthValue(value) {
    document.getElementById('passwordLengthValue').textContent = value;
}