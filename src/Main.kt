//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


        val reserva= mutableListOf<reserva>()










        while (true){


            println("Menu Disponible")
            println("""
            1->Registrar Reserva
            2-> Cancelar Reserva
            3-> Mostrar reservas activas
            4->Salir de sistema
        """.trimIndent())

            println("Selecicione una opcion")
            var eleccion= readln().toInt();
            when(eleccion){
                1->{
                    println("Ingrese ID de la reserva")
                    var idr= readln().toInt()
                    println("Ingrese ID de huesped")
                    var idh= readln().toInt()
                    println("Ingrese nombre de huesped")
                    var nh= readln().toString()
                    println("Ingrese email de huesped")
                    var eh= readln().toString()
                    println("Ingrese numero Habitacion")
                    var nha= readln().toInt()
                    println("Ingrese tipo Habitacion")
                    var th= readln().toString()
                    println("Ingrese precio por noche")
                    var pn= readln().toInt()
                    println("Ingrese cantidad de noches reservadas")
                    var nr= readln().toInt()
                    if (reserva.any { it.numHabitacion == nha }) {
                        println(" Error: La habitación #$nha ya está reservada. Intente con otra.")
                    }
                    reserva.add(reserva(idr, idh, nh, eh, nha, th, pn, nr))
                    println("Reserva registrada con éxito.")


                }
                2->{
                    println("Ingrese ID de la reserva a elimiar")

                    val idEliminar = readln().toInt()
                    val reservaEliminada = reserva.removeIf { it.idReserva == idEliminar }
                    if (reservaEliminada) {
                        println("Reserva eliminada con éxito.")
                    } else {
                        println("No se encontró ninguna reserva con ese ID.")
                    }
                }
                3->{
                    if(reserva.isEmpty()){
                        println("Está vacio")
                    }else {
                        println("Reservas Activas")
                        var totalGeneral = 0
                        reserva.forEach {
                            println(it)
                            totalGeneral += it.montoTotal()
                        }
                        println(" Monto total a pagar por todas las reservas: $totalGeneral")
                    }
                }
                4->{
                    println("Salir De Sistema")
                    false
                }
            }
        }








}