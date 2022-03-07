package pl.minecodes.mineveryusefuloperations;

// compiler doesn't understand our brilliant ideas
// we have to forcefully silent it
@SuppressWarnings("ALL")
public class This {

    private This This;

    public This() {
        this.This = this;
    }

    public This This(This this, This This) {
        return this.This = This;
    }

    public This This() {
        return this.This;
    }

}
