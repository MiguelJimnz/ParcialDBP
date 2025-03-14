class reserva {

    var idReserva=0
    var idHuesped=0
    var nomHuesped=" "
    var email= " "
    var numHabitacion=0;
    var tipoHabitacion=" "
    var precioNoche=0
    var nochesReservadas=0

    constructor()
    constructor(
        idReserva: Int,
        idHuesped: Int,
        nomHuesped: String,
        email: String,
        numHabitacion: Int,
        tipoHabitacion: String,
        precioNoche: Int,
        nochesReservadas: Int
    ) {
        this.idReserva = idReserva
        this.idHuesped = idHuesped
        this.nomHuesped = nomHuesped
        this.email = email
        this.numHabitacion = numHabitacion
        this.tipoHabitacion = tipoHabitacion
        this.precioNoche = precioNoche
        this.nochesReservadas = nochesReservadas
    }

    override fun toString(): String {
        return "reserva(idReserva=$idReserva, idHuesped=$idHuesped, nomHuesped='$nomHuesped', email='$email', numHabitacion=$numHabitacion, tipoHabitacion='$tipoHabitacion', precioNoche=$precioNoche, nochesReservadas=$nochesReservadas)"
    }
    fun montoTotal(): Int {
        return precioNoche * nochesReservadas
    }









}



