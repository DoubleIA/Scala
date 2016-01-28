package chp13 {
  package navigator {
    class Navigator {
      // no need to say chp13.navigator.StarMap
      val map = new StarMap
    }
    class StarMap
  }
  class Ship {
    // no need to say chp13.navigator.Navigator
    val nav = new navigator.Navigator;
  }
  package fleets {
    class Fleet {
      // no need to say chp13.Ship
      def addShip() { new Ship }
    }
  }
}

/**
  package navigator {
     // In package chp13.navigator
     class Navigator
     
     package tests {
       // In package chp13.navigator.tests
       class NavigatorSuite
     }
  }
*/