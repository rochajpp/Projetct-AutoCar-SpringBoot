fetch("/api/getUsers")
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        let users = data;
        const idUser = document.querySelector("#idUser").innerHTML;
        
        for(var i = 0; i < users.length; i++){
            const tbody = document.querySelector(".tbody");
            if(users[i].id != idUser){
                
                const user = document.createElement("tr");
                

                const id= document.createElement("td");
                id.innerHTML = users[i].id;
                const name = document.createElement("td");
                name.innerHTML = users[i].name;
                const username = document.createElement("td");
                username.innerHTML = users[i].login;

                const fieldset = document.createElement("fieldset");
                fieldset.style.width = "14px";
                fieldset.style.height = "14px";
                fieldset.style.border = "1px solid black";
                fieldset.style.borderRadius = "2rem";
                if(users[i].active){
                    fieldset.style.backgroundColor = "green";
                } else{
                    fieldset.style.backgroundColor = "red";
                }

                const active = document.createElement("td");
                active.appendChild(fieldset);

                const actions = document.createElement("td");
                actions.style.display = "flex";
                actions.style.gap = "2rem";

                const set = document.createElement("a");
                set.innerHTML = "Set";
                set.href = "/alterUser?id=" + users[i].id;
             

                const remove = document.createElement("a");
                remove.innerHTML = "Remove";
                remove.href = "/removeUser?id=" + users[i].id;
               

                actions.appendChild(set);
                actions.appendChild(remove);
                
                user.appendChild(id);
                user.appendChild(name);
                user.appendChild(username);
                user.appendChild(active);
                user.appendChild(actions);

                tbody.appendChild(user);

            
            }

            
        }

    });
