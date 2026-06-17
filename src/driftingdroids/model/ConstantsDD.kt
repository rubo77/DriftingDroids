package driftingdroids.model

/**
 * Constants for DriftingDroids (DD) - fallback values when Constants from Roboyard is not available.
 * These constants are used by the Board class and other model classes.
 */
object ConstantsDD {
    // Default board sizes (from Roboyard Constants.DEFAULT_BOARD_SIZE_X/Y)
    const val DEFAULT_BOARD_SIZE_X: Int = 12
    const val DEFAULT_BOARD_SIZE_Y: Int = 14

    // Movement directions (from Roboyard Constants.NORTH/EAST/SOUTH/WEST)
    const val NORTH: Int = 0 // up
    const val EAST: Int = 1 // right
    const val SOUTH: Int = 2 // down
    const val WEST: Int = 3 // left
}
