
package generacidad_tarea;

class Pair<U, T> {
    private U first;
    private T second;
    
    public U getFirst(){
        return first;
    };
    
    public T getSecond(){
        return second;
    };

    @Override
    public String toString(){
        return "(" + first + ", "+second+")";
    };
    public void agregar (U a, T b){
        first = a;
        second = b;
    };
}
