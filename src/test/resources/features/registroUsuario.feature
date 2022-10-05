# Autor: Angie Moreno

@tag1
Feature: Registro de Usuario en la pagina web de Utest

  @scenario1
  Scenario: Registro de Angie en la pagina web de Utest
    Given Angie quiere registrarse en la plataforma
    When El usuario ingresa la informacion solicitada en la pagina para su correcto registro

      | strNombre | strApellido | strCorreo                  | strMesNacimiento | strDiaNacimiento | strAñoNacimiento | strCiudad | strCodigoPostal | strPais  | strPC   | strVersion | strIdioma | strDispositivoMovil | strModelo | strSO       | strContrasena  | strConfirmarContrasena |
      | Angie     | Moreno      | angiecatalina4@hotmail.com | February         | 13               | 1994             | Bogota    | 0000000         | Colombia | Windows | 2000       | Spanish   | Alcatel             | MD01      | Android 2.0 | cataprueba123! | cataprueba123!         |

    Then El registro es exitoso cuando aparece el boton Configuracion Completa.
      | strTextoFinal  |
      | Complete Setup |

