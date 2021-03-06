package groovy.midi.demo

import groovy.midi.GroovyMidi
import groovy.transform.CompileStatic

@CompileStatic
class MidiDemo {

    static def fur_elise(){
// tag::fur_elise[]
        GroovyMidi.play {
            channel(0) {
                pause 100
                play E4, 300
                play DS4, 300
                play E4, 300
                play DS4, 300
                play E4, 300
                play B4, 300
                play D4, 300
                play C4, 300
                play A4, 900
                pause 1000
            }
        }
// end::fur_elise[]
    }

    static def aqualung(){
// tag::aqualung[]
        GroovyMidi.play {
            channel(0) {
                pause 100
                play D4, 300
                play G3, 300
                play AS4, 300
                play C4, 300
                play CS4, 300
                pause 300
                play C4, 300
                pause 1000
            }
        }
// end::aqualung[]
    }

    static def smoke(){
// tag::smoke[]
        GroovyMidi.play {
            channel(0) {
                pause 500

                playChord A4, D4, 450
                playChord C4, F4, 450
                playChord D4, G4, 600

                pause 150

                playChord A4, D4, 450
                playChord C4, F4, 450
                playChord DS4, GS4, 225
                playChord D4, G4, 450

                pause 300

                playChord A4, D4, 450
                playChord C4, F4, 450
                playChord D4, G4, 600

                pause 75

                playChord C4, F4, 450
                playChord A4, D4, 600

                pause 1000
            }
        }
// end::smoke[]
    }

    static void main(args) {
        fur_elise()
        aqualung()
        smoke()
    }
}
