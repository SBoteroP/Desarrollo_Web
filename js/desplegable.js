const links = document.querySelectorAll(".link");

        links.forEach((link) => {
            link.addEventListener("mouseenter", () => {
                const dropdown = link.querySelector(".dropdown");
                if (dropdown) {
                    dropdown.style.display = "block";
                }
            });

            link.addEventListener("mouseleave", () => {
                const dropdown = link.querySelector(".dropdown");
                if (dropdown) {
                    dropdown.style.display = "none";
                }
            });
        });