const url = window.location.href;
fetch(url + "api/car/")
    .then((response) => {
        return response.json();    
    })
    .then((data) => {
        let cars = data;
        const carElement = document.querySelector(".cars-container");

        for(var i = 0; i < cars.length; i++){
            
            const card = document.createElement("div");
            card.classList.add("card")

            const imgCar = document.createElement("img");
            imgCar.alt = "Imagem";
            imgCar.src = cars[i].image;

            const infoCar = document.createElement("div");
            infoCar.classList.add("info-car");

            const h1 = document.createElement("h1");
            h1.innerHTML = cars[i].brand;

            const h2 = document.createElement("h2");
            h2.innerHTML = cars[i].model;

            const br = document.createElement("br");
            const br2 = document.createElement("br");

            const p = document.createElement("p");
            p.classList.add("desc-car");
            p.innerHTML = cars[i].description;

            const button = document.createElement("button");
            button.innerHTML = "$ " + cars[i].value;

            infoCar.appendChild(h1);
            infoCar.appendChild(h2);
            infoCar.appendChild(br);
            infoCar.appendChild(p);
            infoCar.appendChild(br2);
            infoCar.appendChild(button);

            card.appendChild(imgCar);
            card.appendChild(infoCar);

            carElement.appendChild(card);

        }
    })