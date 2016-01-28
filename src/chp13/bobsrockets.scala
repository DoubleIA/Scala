package chp13 {
  
  class Boat
  
  package bobsrockets {
    package navigator {
      package launch {
        class Booster1
      }
      class MissionControl {
        val booster1 = new launch.Booster1
        val booster2 = new bobsrockets.launch.Booster2
        val booster3 = new _root_.chp13.launch.Booster3
      }
    }
    
    package launch {
      class Booster2
    }
  }
}

package chp13.fleets {
  class Fleets {
    // Doesn't compile! Ship is not in scope
  //    def addShip() { new Boat }
  }
}
