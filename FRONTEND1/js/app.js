new Vue({
    el:'#app',
    data(){
        return{
            id:"",
            nombre:"",
            apellido:"",
            telefono:"",
            correo:"",
            direccion:"",
            etiqueta:"",
            datosconsulta:{},
            ideliminar:"",
        }
    },

    methods:{

        guardarContacto(){
            const endpoint="http://localhost:8080/contacto";
            const opciones={
                method:'POST',
                headers:{'Content-Type':'application/json'},
                body:JSON.stringify({id:this.id, nombre:this.nombre, apellido:this.apellido,telefono:this.telefono,correo:this.correo, direccion:this.direccion, etiqueta:this.etiqueta})
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
            endpoint="http://localhost:8080/contacto";
            fetch(endpoint).then(async response=>{
                this.datosconsulta=await response.json();
            })
        },
        eliminaContacto(){
            const endpoint="http://localhost:8080/contacto/"+this.ideliminar;
            const opciones={method:'DELETE'};

            fetch(endpoint, opciones).then(async response=>{
                alert("El contacto fue eliminado");
                this.ideliminar="";
            })
        }
    }
})