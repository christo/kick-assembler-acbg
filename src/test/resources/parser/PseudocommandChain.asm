// depends one on another later defined one
.pseudocommand set_cursor_position column : row {
  ldx row
  ldy column
  plot_set
}

.pseudocommand plot_set {
  clc
  jsr $fff0
}