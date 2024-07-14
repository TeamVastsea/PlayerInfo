package cc.vastsea.playerinfo.papi;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

/**
 * PlaceholderAPI expansion for PlayerInfo.
 * @version 1.1
 * @author Snowball_233
 * @see PlaceholderExpansion
 */
public class PlayerInfoExpansion extends PlaceholderExpansion {

    private static final String VERSION = "1.2";

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public boolean canRegister() {
        return Bukkit.getPluginManager().isPluginEnabled("ViaVersion") &&
                Bukkit.getPluginManager().isPluginEnabled("floodgate");
    }

    @Override
    public String getAuthor() {
        return "Snowball_233";
    }

    @Override
    public String getIdentifier() {
        return "playerinfo";
    }

    @Override
    public String getVersion() {
        return VERSION;
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        if (player == null) {
            return "";
        }

        String version = getPlayerVersion(player);
        String platform = getPlayerPlatformString(player);
        String device = getPlayerDeviceString(player);

        switch (identifier.toLowerCase()) {
            case "version":
                return String.format("[%s]", version);

            case "platform":
                return String.format("[%s]", platform);

            case "device":
                return String.format("[%s]", device);

            default:
                return String.format("[%s][%s][%s]", version, platform, device);
        }
    }

    private String getPlayerVersion(Player player) {
        int protocolId = Via.getAPI().getPlayerVersion(player.getUniqueId());
        ProtocolVersion protocolVersion = ProtocolVersion.getProtocol(protocolId);
        return protocolVersion.getName();
    }

    private String getPlayerPlatformString(Player player) {
        FloodgatePlayer floodgatePlayer = FloodgateApi.getInstance().getPlayer(player.getUniqueId());
        if (floodgatePlayer != null) {
            switch (floodgatePlayer.getDeviceOs()) {
                case GOOGLE:
                case IOS:
                case AMAZON:
                case GEARVR:
                case HOLOLENS:
                case DEDICATED:
                    return "Mobile";
                case OSX:
                case UWP:
                case WIN32:
                    return "Computer";
                case PS4:
                case NX:
                case XBOX:
                    return "Console";
                default:
                    return "Unknown";
            }
        } else {
            return "Java";
        }
    }

    private String getPlayerDeviceString(Player player) {
        FloodgatePlayer floodgatePlayer = FloodgateApi.getInstance().getPlayer(player.getUniqueId());
        if (floodgatePlayer != null) {
            switch (floodgatePlayer.getDeviceOs()) {
                case GOOGLE:
                    return "Android";
                case IOS:
                    return "iOS";
                case OSX:
                    return "OSX";
                case AMAZON:
                    return "Amazon";
                case GEARVR:
                    return "GearVR";
                case HOLOLENS:
                    return "Hololens";
                case UWP:
                    return "UWP";
                case WIN32:
                    return "Win32";
                case DEDICATED:
                    return "Dedicated";
                case PS4:
                    return "PS4";
                case NX:
                    return "Switch";
                case XBOX:
                    return "Xbox";
                default:
                    return "Unknown";
            }
        } else {
            return "Java";
        }
    }
}
