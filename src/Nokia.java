import java.util.Scanner;

public class Nokia {
    private static Object String;

    public static void main(String[] args) {
        String prompt = """
                Phonebook 1
                Messages 2
                Chat 3
                Call Register  4
                Tones 5
                Settings 6
                For Call Divert 7
                Games 8
                Calculator 9
                Reminder 10
                Clock 11
                Profiles 12
                Sim Services 13
                """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("*Phonebook*");
                String userchoiceprompt = """
                        1.Search 
                        2.Service nos
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send b'card
                        8.Options
                        9.Speed dial
                        10.Voice tag
                                         
                        """;
                System.out.println(userchoiceprompt);

                int subChoice = input.nextInt();
                switch (subChoice) {
                    case 1:
                        System.out.println("1.Search");
                        break;
                    case 2:
                        System.out.println("2.Service nos");
                        break;
                    case 3:
                        System.out.println("3.Add name");
                        break;
                    case 4:
                        System.out.println("4.Erase");
                        break;
                    case 5:
                        System.out.println("5.Edit");
                        break;
                    case 6:
                        System.out.println("6.Assign tone");
                        break;
                    case 7:
                        System.out.println("7.Send b'card");
                        break;
                    case 8:
                        System.out.println("8.Options");
                        String optionprompt = """
                                1.Type of view
                                2.Memory status
                                """;
                        System.out.println(optionprompt);
                        int substitute = input.nextInt();
                        switch (substitute) {
                            case 1:
                                System.out.println("1.Type of view");
                                break;
                            case 2:
                                System.out.println("2.Memory status");
                                break;
                        }
                            break;
                    case 9:
                        System.out.println("9.Speed dials");
                        break;
                    case 10:
                        System.out.println("10.Voice tags");
                        break;
                        }
                        break;

            case 2:
                System.out.println("2.*Messages*");
                String messaging = """
                        1.Write message
                        2.Inbox
                        3.Outbox
                        4.Picture messages
                        5.Templates
                        6.Smileys
                        7.Message settings
                        8.Info service
                        9.Voicemail number
                        10.Service command editor
                        
                        """;
                System.out.println(messaging);
                int sms = input.nextInt();
                        switch (sms) {
                            case 1:
                                System.out.println("1.Write message");
                                break;
                            case 2:
                                System.out.println("2.Inbox");
                                break;
                            case 3:
                                System.out.println("3.Outbox");
                                break;
                            case 4:
                                System.out.println("4.Picture messages");
                                break;
                            case 5:
                                System.out.println("5.Templates");
                                break;
                            case 6:
                                System.out.println("6.Smileys");
                                break;
                            case 7:
                                System.out.println("7.Message settings");
                                String Messagesettings = """
                                        1.Set1
                                        2.Common
                                        """;
                                System.out.println(Messagesettings);
                                int sub = input.nextInt();
                                switch (sub) {
                                    case 1:
                                        System.out.println("1.Set1");
                                        String ran = """
                                                1.Message centre number
                                                2.Message sent as
                                                3.Message validity
                                                """;
                                        System.out.println(ran);
                                        int bus = input.nextInt();
                                        switch (bus) {
                                            case 1:
                                                System.out.println("1.Message centre number");
                                                break;
                                            case 2:
                                                System.out.println("2.Message sent as");
                                                break;
                                            case 3:
                                                System.out.println("3.Message validity");
                                                break;
                                        }
                                        break;

                                    case 2:
                                        System.out.println("2.Common");
                                        String nan = """
                                                1.Delivery reports
                                                2.Reply via same centre
                                                3.Character support
                                                """;
                                        System.out.println(nan);
                                        int ban = input.nextInt();
                                        switch (ban) {
                                            case 1:
                                                System.out.println("1.Delivery report");
                                                break;
                                            case 2:
                                                System.out.println("2.Reply via same centre");
                                                break;
                                            case 3:
                                                System.out.println("3.Character support");
                                                break;

                                        }
                                        break;
                                }
                            case 8:
                                System.out.println("8.Info service");
                                break;
                            case 9:
                                System.out.println("9. Voice Mailbox number");
                                break;
                            case 10:
                                System.out.println("10.Service command editor");
                                break;
                                }
                                break;
            case 3:
                System.out.println("*3.Chat*");
                break;

            case 4:
                            System.out.println("*4.Call register*");
                                        String Callregister = """
                                        1.Missed calls
                                        2.Received calls
                                        3.Dailed numbers
                                        4.Erase recent call list
                                        5.Show call duration
                                        6.Show call cost
                                        7.Call cost settings
                                        8.Prepaid credit
                                        """;
                System.out.println(Callregister);

                                int call = input.nextInt();
                                switch (call) {
                                    case 1:
                                        System.out.println("1.Missed calls");
                                        break;
                                    case 2:
                                        System.out.println("2.Received calls");
                                        break;
                                    case 3:
                                        System.out.println("3.Dialed number");
                                        break;
                                    case 4:
                                        System.out.println("4.Erase recent call list");
                                        break;
                                    case 5:
                                        System.out.println("5.Show call duration");
                                        String show = """
                                                1.Last call duration
                                                2.All calls duration
                                                3.Received calls duration
                                                4.Dialed calls duration
                                                5.Clear timer
                                                """;
                                        int plan = input.nextInt();
                                        switch (plan) {
                                            case 1:
                                                System.out.println("1.Last call duration");
                                                break;
                                            case 2:
                                                System.out.println("2.All calls duration");
                                                break;
                                            case 3:
                                                System.out.println("3.Received calls duration");
                                                break;
                                            case 4:
                                                System.out.println("4.Dialed calls duration");
                                                break;
                                            case 5:
                                                System.out.println("5.Clear timer");
                                                break;
                                        }
                                        break;
                                    case 6:
                                        System.out.println("6.Show call cost");
                                        String cost = """
                                                1.Last call cost
                                                2.All calls cost
                                                3.Clear counters
                                                """;
                                        int coast = input.nextInt();
                                        switch (coast) {
                                            case 1:
                                                System.out.println("1.Last call cost");
                                                break;
                                            case 2:
                                                System.out.println("2.All calls cost");
                                                break;
                                            case 3:
                                                System.out.println("3.Clear counters");
                                                break;
                                        }
                                        break;
                                    case 7:
                                        System.out.println("7.Call cost settings");
                                        String callcostsetting = """
                                                1.Call cost limit
                                                2.Show cost in
                                                """;
                                        int calm = input.nextInt();
                                        switch (calm) {
                                            case 1:
                                                System.out.println("Call cost limit");
                                                break;
                                            case 2:
                                                System.out.println("Show cost in");
                                                break;
                                        }
                                        break;
                                    case 8:
                                        System.out.println("Prepaid credit");
                                        break;
                                }
                              break;
            case 5:
                System.out.println("*5.Tones*");
                String notification = """
                        1.Ring tone
                        2.Ring volume
                        3.Incoming call alert
                        4.Composer
                        5.Message alert tone
                        6.Keypad tones
                        7.Warning and game tones
                        8.Vibrating alert
                        9.Screen saver
                        """;
                int alert = input.nextInt();
                switch (alert) {
                    case 1:
                        System.out.println("1.Ring tone");
                    break;
                    case 2:
                        System.out.println("2.Ring volume");
                        break;
                    case 3:
                        System.out.println("3.Incoming call alert");
                        break;
                    case 4:
                        System.out.println("4.Composer");
                        break;
                    case 5:
                        System.out.println("5.Message alert tone");
                        break;
                    case 6:
                        System.out.println("6.Keypad tones");
                        break;
                    case 7:
                        System.out.println("7.Warning and game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
                break;
            case 6:
                System.out.println("*6.Settings*");
                String sat = """
                        1.Call settings 
                        2.Phone settings
                        3.Security settings
                        4.Restore factory settings
                        """;
                System.out.println(sat);
                int fact = input.nextInt();
                switch (fact) {
                    case 1:
                        System.out.println("1.Call settings");
                        String pillow = """
                                1.Automatic redial
                                2.Speed dialing
                                3.Call waiting options
                                4.Own number sending
                                5.Phone line in use
                                6.Automatic answer
                                """;
                        System.out.println("pillow");
                        int fan = input.nextInt();
                        switch (fan) {
                            case 1:
                                System.out.println("1.Automatic redial");
                                break;
                            case 2:
                                System.out.println("2.Speed dialing");
                                break;
                            case 3:
                                System.out.println("3.Call waiting option");
                                break;
                            case 4:
                                System.out.println("4.Own number sending");
                                break;
                            case 5:
                                System.out.println("5.Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("2.Phone settings");
                        String mall = """
                                1.Language
                                2.Cell info display
                                3.Welcome note
                                4.Network selection
                                5.Lights
                                6.Confirm sim service action
                                """;
                        System.out.println("mall");
                        int dor = input.nextInt();
                        switch (dor) {
                            case 1:
                                System.out.println("1.Language");
                                break;
                            case 2:
                                System.out.println("2.Cell info display");
                                break;
                            case 3:
                                System.out.println("3.Welcome note");
                                break;
                            case 4:
                                System.out.println("4.Network selection");
                                break;
                            case 5:
                                System.out.println("5.Lights");
                                break;
                            case 6:
                                System.out.println("6.Confirm sim service action");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("3.Security settings");
                        String malt = """
                                1.Pin code request
                                2.Call baring service
                                3.Fixed dialing
                                4.Closed user group
                                5.Phone security
                                6.Change access codes
                                """;
                        System.out.println("malt");
                        int mat = input.nextInt();
                        switch (mat) {
                            case 1:
                                System.out.println("1.Pin code request");
                                break;
                            case 2:
                                System.out.println("2.Call baring service");
                                break;
                            case 3:
                                System.out.println("3.Fixed dialing");
                                break;
                            case 4:
                                System.out.println("4.Closed user group");
                                break;
                            case 5:
                                System.out.println("5.Phone security");
                                break;
                            case 6:
                                System.out.println("6.Change access codes");
                                break;
                        }
                      break;
                    case 4:
                        System.out.println("Restore factory settings");
                        break;
                }
                break;
            case 7:
                System.out.println("*7.Call divert*");
                break;
            case 8:
                System.out.println("*8.Games*");
                break;
            case 9:
                System.out.println("*9.Calculator*");
                break;
            case 10:
                System.out.println("*10.Reminders*");
                break;
            case 11:
                System.out.println("*11.Clocks*");
                String pain = """
                        1.Alarm clock
                        2.Clock settings
                        3.Date settings
                        4.Stop watch
                        5.Count down timer
                        6.Auto update of date and time
                        """;
                int slip = input.nextInt();
                switch (slip) {
                    case 1:
                        System.out.println("1.Alarm clock");
                        break;
                    case 2:
                        System.out.println("2.Clock settings");
                        break;
                    case 3:
                        System.out.println("3.Date settings");
                        break;
                    case 4:
                        System.out.println("4.Stop watch");
                        break;
                    case 5:
                        System.out.println("5.Count down timer");
                        break;
                    case 6:
                        System.out.println("6.Auto update of date and time");
                        break;
                }
                break;
            case 12:
                System.out.println("*12.Profiles*");
                break;
            case 13:
                System.out.println("*13.SIM services*");
                break;
        }



                        }

                }
