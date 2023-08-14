document.getElementById("contact-form").addEventListener("submit", function(event) {
    var nameInput = document.getElementById("name");
    var emailInput = document.getElementById("email");

    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    function countWords(str) {
      return str.trim().split(/\s+/).length;
    }

    if (countWords(nameInput.value) < 2) {
      alert("Por favor, ingrese su nombre y apellido.");
      event.preventDefault(); 
      return;
    }

    if (!emailPattern.test(emailInput.value)) {
      alert("Por favor, ingrese una dirección de correo electrónico válida.");
      event.preventDefault(); 
      return;
    }

  });




