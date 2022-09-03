public class IteratorApplication {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        iterateByChannels(channels, ChannelTypeEnum.ALL);

        System.out.println("-------------------------------------------------------");

        iterateByChannels(channels, ChannelTypeEnum.UKRAINIAN);
    }

    private static void iterateByChannels(ChannelCollection channels, ChannelTypeEnum type) {
        ChannelIterator iterator = channels.iterator(type);
        while (iterator.hasNext()) {
            Channel channel = iterator.next();
            System.out.println(channel.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.UKRAINIAN));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.POLISH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.UKRAINIAN));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.POLISH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.UKRAINIAN));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.POLISH));
        return channels;
    }
}
