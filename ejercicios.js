//Pre : Rebem 20 nombres
function
    constant
        string MSG_1 = "Introduce 20 numeros"
        integer SIZE = 20
    endconstant
    var
        integer arrayInt[SIZE]
        integer i
    endvar
    for i=0 to SIZE do
        read (arrayInt[i])
    endfor
    while i=1 < SIZE do
        write (arrayInt[i])
        i = i +2
    endwhile
endfunction
//Post : Donem els resultats esperats

//Pre : Recibimos notas de 10 alumnos con 6 modulos diferentes
function
    constant
        string MSG_1 = "Notes del alumne "
        <--string MSG_2 = "Alumno numero: "(i).-->
        string MSG_3 = "Nota media del alumno: "(i)" = "
        integer ROWS = 10, COLS = 6
    endconstant
    var
        integer matInt[ROWS][COLS]
        integer i, j
        integer nota = 0
    endvar
    for i=0 to ROWS do
        write (MSG_1)
        for j=0 to COLS do
            read (matInt[i][j])
        endfor
    endfor
    for i=0 to  ROWS do
        for j=0 to COLS do
            nota = nota + j
            j = j +1
        endfor
        write (MSG_3, nota/6)
        nota = 0
        i = i +1
    endfor
endfunction
//Post : Mostramos uno por uno la nota media del alumno

//Pre : Recibimos 20 numeros para mostrarlos luego 
function
    constant
        integer SIZE = 20
    endconstant
    var
        integer i
    endvar
    for i=0 to SIZE do
        read (arrayInt[i])
        while arrayInt[i] <=9 && arrayInt[i] >= 1 do
            read (arrayInt[i])
        endwhile
    endfor
    for i=0 ot SIZE do
        write (arrayInt[i])
    endfor
    for i=19 to 0 do
        write (arrayInt[i])
    endfor
endfunction
//Post : Devolvemos el resultado esperado