package groovy.midi.demo
import groovy.midi.GroovyMidi
import groovy.transform.CompileStatic

/**
 * Created by jorge on 24/11/16.
 */
class Piano {

    static void main(String...args){

        if( args.length == 0 ){
            println "se requiere una partitura"
            return
        }

        if( new File(args[0]).exists() ) {
            String txt =  new File(args[0]).text
            GroovyShell shell = new GroovyShell()
            shell.evaluate("""groovy.midi.GroovyMidi.play {            
                    $txt
            }""")
        }else{
            switch( args[0] ){
                case 'elise':
                    MidiDemo.fur_elise()
                    break
                case 'aqualung':
                    MidiDemo.aqualung()
                    break
                case 'smoke':
                    MidiDemo.smoke()
                    break
            }
        }
    }

}
