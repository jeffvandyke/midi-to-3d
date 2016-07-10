#Midi-to-3d

Started date: 2016-07-05 Mon.

(No license yet, consider it copyrighted until I finish deciding; it will probably be an attribution do-what-you-want deal.)

This is a work in progress reimplementation of a midi-based live virtual instrument performance 3d animation that I wrote and performed using javascript as part of a engineering talent show in my senior year of college. The video of the final result is at <https://www.youtube.com/watch?v=rYNed4JHRWw>, and I might upload the code one of these days if anyone wants to see it.

This will be rewritten from the ground up in order for me to practice and test some of the ideas about Clojure(script) I've been learning over these past few months. It will use Three.js for rendering, and will be developed using boot-clj tools, ClojureScript, etc., and will use 3d models created in Blender. I will probably use Fluidsynth with Web MIDI for the music generation, which will be documented first for Linux systems.

I will try to do things as clojurey as possible, dealing with values and composable functions wherever I can, and trying to minimize the number of places mutable state is being held.
