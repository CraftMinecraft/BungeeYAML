BungeeYAML
==========

A simple port of the Bukkit's Configuration API (by BukkitTeam) and SuperEasyConfig (by MrFrogg) to BungeeCord.

How to use
----------

This library is fairly straightforward to use :
There are two ways to use it. Either by directly using the Configuration API, or by using the SuperEasyConfig.

### SuperEasyConfig ######
All from MrFrogg's post : 

Create a new class that extends Config. Add any fields you want the same way as the examples in the next post. For the rest of this post I'll be using the Basic Example below.

Now it's finally time to use your config. This is harder to explain, so first I'll give you an example plugin;

    public class ExamplePlugin extends Plugin {
        public BasicExampleConfig config; // variable where we're going to store the config
 
        public void onEnable() {
            try {
                config = new BasicExampleConfig(this); // create config
                config.init(); // load config file if it exists, create it if it doesn't
            } catch(Exception ex) {
                ProxyServer.getInstance().getLogger().log(Level.SEVERE, "FAILED TO LOAD CONFIG!!!", ex);
                return;
            }
            ProxyServer.getInstance().getPluginManager().registerCommand(new Command("test") {
                @Override
                public void execute(CommandSender sender, String[] args) {
                    sender.sendMessage(config.example_string);
                }
            }
        }
 
        public void onDisable() {
            config.save(); // save the config
        }

    }

And now a config : 
    public class BasicExampleConfig extends Config {
 
        public BasicExampleConfig(Plugin plugin) {
            CONFIG_FILE = new File(plugin.getDataFolder(), "config.yml");
            CONFIG_HEADER = "Basic Example Configuration File";
        }
 
        public String example_string = "Example";
        public boolean example_boolean = true;
    }

This creates the following config : 
    example:
        string: 'Example'
        boolean: true

That's it. When someone does /test, it will show them the configuration example.string, by default, 'Example'. For more examples, look at [SuperEasyConfig](http://forums.bukkit.org/threads/lib-supereasyconfig-v1-2-based-off-of-codename_bs-awesome-easyconfig-v2-1.100569/).

### Bukkit's Configuration API ###
Comming soon.
