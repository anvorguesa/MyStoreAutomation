#language: es
@testfeature
Característica: Login

  @test
  Esquema del escenario: Iniciar sesión
    Dado que me encuentro en la página de la tienda
    Cuando me logueo con mi email "<email>" y clave "<password>"
    Entonces valido la autenticación con el mensaje "<mensaje>"


    Ejemplos:
      | email                      | password         | mensaje                |
      | diegon_7@hotmail.com       | 2016137405Arce  | Diego Axel Arce Muñoz   |
      | usuario_invalido@mail.com  | clave123        | Error de autenticación. |
      | srliposa@gmail.com         | 2016137405Arce  | Alex Diego Arce Muñoz   |
