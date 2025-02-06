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

  @test
    Escenario: Iniciar sesión
    Dado que en la página de la tienda
    Y me logueo con mi usuario "diegon_7@hotmail.com" y clave "2016137405Arce"
    Cuando navego a la categoria "Clothes" y subcategoria "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito
