#language: es
@testfeature
Característica: Login

  @test
  Esquema del escenario: Iniciar sesión
    Dado que me encuentro en la página de la tienda
    Cuando me logueo con mi email "<email>" y clave "<password>"
    Entonces valido que debería aparecer el título de "<titulo>"
    Y también valido que al menos exista un producto en la tienda

    Ejemplos:
      | email                      | password         | titulo                 |
      | diegon_7@hotmail.com       | 2016137405Arce  | PRODUCTOS DESTACADOS   |
      | usuario_invalido@mail.com  | clave123        | Error de autenticación |
      | srliposa@gmail.com      | 2016137405Arce  | PRODUCTOS DESTACADOS   |

