public class LunarSpacecraft {
    public static void main(String[] args) {
        int[] startingPoint = {0, 0, 0};
        String initialDirection = "N";
        String[] commands = {"f", "r", "u", "b", "l"};

        int[] finalPosition = translateCommands(startingPoint, initialDirection, commands);
        String finalDirection = translateDirection(initialDirection, commands);

        System.out.println("Final Position: (" + finalPosition[0] + ", " + finalPosition[1] + ", " + finalPosition[2] + ")");
        System.out.println("Final Direction: " + finalDirection);
    }

    public static int[] translateCommands(int[] startingPoint, String initialDirection, String[] commands) {
        int x = startingPoint[0];
        int y = startingPoint[1];
        int z = startingPoint[2];
        String direction = initialDirection;

        for (String command : commands) {
            if (command.equals("f")) {
                if (direction.equals("N")) {
                    y++;
                } else if (direction.equals("S")) {
                    y--;
                } else if (direction.equals("E")) {
                    x++;
                } else if (direction.equals("W")) {
                    x--;
                } else if (direction.equals("U")) {
                    z++;
                } else if (direction.equals("D")) {
                    z--;
                }
            } else if (command.equals("b")) {
                if (direction.equals("N")) {
                    y--;
                } else if (direction.equals("S")) {
                    y++;
                } else if (direction.equals("E")) {
                    x--;
                } else if (direction.equals("W")) {
                    x++;
                } else if (direction.equals("U")) {
                    z--;
                } else if (direction.equals("D")) {
                    z++;
                }
            } else if (command.equals("l")) {
                if (direction.equals("N")) {
                    direction = "W";
                } else if (direction.equals("S")) {
                    direction = "E";
                } else if (direction.equals("E")) {
                    direction = "N";
                } else if (direction.equals("W")) {
                    direction = "S";
                }
            } else if (command.equals("r")) {
                if (direction.equals("N")) {
                    direction = "E";
                } else if (direction.equals("S")) {
                    direction = "W";
                } else if (direction.equals("E")) {
                    direction = "S";
                } else if (direction.equals("W")) {
                    direction = "N";
                }
            } else if (command.equals("u")) {
                if (direction.equals("N")) {
                    direction = "U";
                } else if (direction.equals("S")) {
                    direction = "D";
                } else if (direction.equals("E")) {
                    direction = "U";
                } else if (direction.equals("W")) {
                    direction = "D";
                }
            } else if (command.equals("d")) {
                if (direction.equals("N")) {
                    direction = "D";
                } else if (direction.equals("S")) {
                    direction = "U";
                } else if (direction.equals("E")) {
                    direction = "D";
                } else if (direction.equals("W")) {
                    direction = "U";
                }
            }
        }

        int[] finalPosition = {x, y, z};
        return finalPosition;
    }

    public static String translateDirection(String initialDirection, String[] commands) {
        String direction = initialDirection;

        for (String command : commands) {
            if (command.equals("l")) {
                if (direction.equals("N")) {
                    direction = "W";
                } else if (direction.equals("S")) {
                    direction = "E";
                } else if (direction.equals("E")) {
                    direction = "N";
                } else if (direction.equals("W")) {
                    direction = "S";
                }
            } else if (command.equals("r")) {
                if (direction.equals("N")) {
                    direction = "E";
                } else if (direction.equals("S")) {
                    direction = "W";
                } else if (direction.equals("E")) {
                    direction = "S";
                } else if (direction.equals("W")) {
                    direction = "N";
                }
            } else if (command.equals("u")) {
                if (direction.equals("N")) {
                    direction = "U";
                } else if (direction.equals("S")) {
                    direction = "D";
                } else if (direction.equals("E")) {
                    direction = "U";
                } else if (direction.equals("W")) {
                    direction = "D";
                }
            } else if (command.equals("d")) {
                if (direction.equals("N")) {
                    direction = "D";
                } else if (direction.equals("S")) {
                    direction = "U";
                } else if (direction.equals("E")) {
                    direction = "D";
                } else if (direction.equals("W")) {
                    direction = "U";
                }
            }
        }

        return direction;
    }
}