new Vue({
    el:'#app',
    data(){
        return{
            id:"",
            nombre:"",
            apellido:"",
            telefono:"",
            correo:"",
            datosconsulta:{},
            ideliminar:"",
        }
    },

    methods:{

        guardarContacto(){
            const endpoint="http://localhost:8080/cliente";
            const opciones={
                method:'POST',
                headers:{'Content-Type':'application/json'},
                body:JSON.stringify({id:this.id, nombre:this.nombre, apellido:this.apellido,telefono:this.telefono,correo:this.correo})
            };
            fetch(endpoint,opciones).then(async response=>{
                alert("Contacto guardado");
                Swal.fire({
                    position: 'top-end',
                    icon: 'success',
                    title: 'contacto guardado',
                    showConfirmButton: false,
                    timer: 1500
                  })
            });

        },
        consultarContactos(){
            endpoint="http://localhost:8080/cliente";
            fetch(endpoint).then(async response=>{
                this.datosconsulta=await response.json();
            })
        },
        eliminaCliente(){
            const endpoint="http://localhost:8080/cliente/"+this.ideliminar;
            const opciones={method:'DELETE'};

            fetch(endpoint, opciones).then(async response=>{
                alert("el cliente fué eliminado");
                this.ideliminar="";
            })
        }
    }
})